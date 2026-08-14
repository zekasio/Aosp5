package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgne {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzgcj.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair zzb(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzgnn.zzf.zza("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void zzc(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzd(eCPublicKey, eCPrivateKey);
        zzgcj.zzb(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void zzd(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (zzgcj.zzc(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] zze(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger;
        zzd(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        zzgcj.zzb(w, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) zzgnn.zze.zza("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger2 = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzgcj.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger bigIntegerZza = zzgcj.zza(curve);
            BigInteger bigIntegerMod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(bigIntegerZza);
            if (bigIntegerZza.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerZza);
            if (bigIntegerMod2.equals(BigInteger.ZERO)) {
                bigInteger = BigInteger.ZERO;
            } else {
                if (bigIntegerZza.testBit(0) && bigIntegerZza.testBit(1)) {
                    bigIntegerModPow = bigIntegerMod2.modPow(bigIntegerZza.add(BigInteger.ONE).shiftRight(2), bigIntegerZza);
                } else {
                    bigIntegerModPow = null;
                    if (bigIntegerZza.testBit(0) && !bigIntegerZza.testBit(1)) {
                        BigInteger bigIntegerAdd = BigInteger.ONE;
                        BigInteger bigIntegerShiftRight = bigIntegerZza.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerZza);
                            if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                                bigInteger = bigIntegerAdd;
                                break;
                            }
                            BigInteger bigIntegerModPow2 = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerZza);
                            if (bigIntegerModPow2.add(BigInteger.ONE).equals(bigIntegerZza)) {
                                BigInteger bigIntegerShiftRight2 = bigIntegerZza.add(BigInteger.ONE).shiftRight(1);
                                BigInteger bigIntegerMod4 = BigInteger.ONE;
                                BigInteger bigInteger3 = bigIntegerAdd;
                                for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                    BigInteger bigIntegerMultiply = bigInteger3.multiply(bigIntegerMod4);
                                    BigInteger bigIntegerMod5 = bigInteger3.multiply(bigInteger3).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerZza).multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                    BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerZza);
                                    if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                        BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerZza);
                                        bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerZza);
                                        bigInteger3 = bigIntegerMod7;
                                    } else {
                                        bigInteger3 = bigIntegerMod5;
                                        bigIntegerMod4 = bigIntegerMod6;
                                    }
                                }
                                bigIntegerModPow = bigInteger3;
                            } else {
                                if (!bigIntegerModPow2.equals(BigInteger.ONE)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                                i++;
                                if (i == 128 && !bigIntegerZza.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        }
                    }
                }
                if (bigIntegerModPow != null && bigIntegerModPow.multiply(bigIntegerModPow).mod(bigIntegerZza).compareTo(bigIntegerMod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger = bigIntegerModPow;
            }
            if (!bigInteger.testBit(0)) {
                bigIntegerZza.subtract(bigInteger).mod(bigIntegerZza);
            }
            return bArrGenerateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static ECPrivateKey zzf(int i, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), zzh(i)));
    }

    public static ECPublicKey zzg(ECParameterSpec eCParameterSpec, int i, byte[] bArr) throws GeneralSecurityException {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int iZza = zza(curve);
        int length = bArr.length;
        if (length != iZza + iZza + 1) {
            throw new GeneralSecurityException("invalid point size");
        }
        if (bArr[0] != 4) {
            throw new GeneralSecurityException("invalid point format");
        }
        int i2 = iZza + 1;
        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, length)));
        zzgcj.zzb(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static byte[] zzi(int i, int i2, ECPoint eCPoint) throws GeneralSecurityException {
        return zzj(zzh(i).getCurve(), 1, eCPoint);
    }

    public static byte[] zzj(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) throws GeneralSecurityException {
        zzgcj.zzb(eCPoint, ellipticCurve);
        int iZza = zza(ellipticCurve);
        int i2 = i - 1;
        if (i2 == 0) {
            int i3 = iZza + iZza + 1;
            byte[] bArr = new byte[i3];
            byte[] bArrZza = zzgci.zza(eCPoint.getAffineX());
            byte[] bArrZza2 = zzgci.zza(eCPoint.getAffineY());
            int length = bArrZza2.length;
            System.arraycopy(bArrZza2, 0, bArr, i3 - length, length);
            int length2 = bArrZza.length;
            System.arraycopy(bArrZza, 0, bArr, (iZza + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (i2 != 2) {
            int i4 = iZza + 1;
            byte[] bArr2 = new byte[i4];
            byte[] bArrZza3 = zzgci.zza(eCPoint.getAffineX());
            int length3 = bArrZza3.length;
            System.arraycopy(bArrZza3, 0, bArr2, i4 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        int i5 = iZza + iZza;
        byte[] bArr3 = new byte[i5];
        byte[] bArrZza4 = zzgci.zza(eCPoint.getAffineX());
        int length4 = bArrZza4.length;
        if (length4 > iZza) {
            bArrZza4 = Arrays.copyOfRange(bArrZza4, length4 - iZza, length4);
        }
        byte[] bArrZza5 = zzgci.zza(eCPoint.getAffineY());
        int length5 = bArrZza5.length;
        if (length5 > iZza) {
            bArrZza5 = Arrays.copyOfRange(bArrZza5, length5 - iZza, length5);
        }
        int length6 = bArrZza5.length;
        System.arraycopy(bArrZza5, 0, bArr3, i5 - length6, length6);
        int length7 = bArrZza4.length;
        System.arraycopy(bArrZza4, 0, bArr3, iZza - length7, length7);
        return bArr3;
    }

    public static ECParameterSpec zzh(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? zzgcj.zzc : zzgcj.zzb : zzgcj.zza;
    }
}

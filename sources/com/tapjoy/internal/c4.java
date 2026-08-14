package com.tapjoy.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes2.dex */
public class c4<E> extends b4<List<E>> {
    public final /* synthetic */ b4 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(b4 b4Var, z3 z3Var, Class cls) {
        super(z3Var, cls);
        this.m = b4Var;
    }

    @Override // com.tapjoy.internal.b4
    public void a(e4 e4Var, Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.tapjoy.internal.b4
    public int b(Object obj) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.tapjoy.internal.b4
    public void a(e4 e4Var, int i, Object obj) {
        List list = (List) obj;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.m.a(e4Var, i, list.get(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.tapjoy.internal.b4
    public int a(int i, Object obj) {
        List list = (List) obj;
        int size = list.size();
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += this.m.a(i, list.get(i2));
        }
        return iA;
    }

    @Override // com.tapjoy.internal.b4
    public Object a(d4 d4Var) {
        return Collections.singletonList(this.m.a(d4Var));
    }
}

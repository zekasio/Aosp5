#!/bin/bash
set -e

export PATH="/home/codespace/.fly/bin:$PATH"

echo "=========================================================="
echo "    🚀 Deploying AOS5 Multiplayer Relay Server to Fly.io   "
echo "=========================================================="

cd "$(dirname "$0")"

# Check if logged in
if ! flyctl auth whoami > /dev/null 2>&1; then
    echo "🔑 Please log in or sign up to Fly.io (it will open a browser or terminal link):"
    flyctl auth login
fi

echo "📦 Launching and deploying app..."
if [ ! -f "fly.toml" ]; then
    flyctl launch --no-deploy --copy-config
fi

# Allocate dedicated IPv4 for UDP routing
echo "🌐 Allocating dedicated public IPv4 address for UDP traffic..."
flyctl ips allocate-v4 || true

echo "🚀 Deploying container to Fly.io cloud..."
flyctl deploy

echo "=========================================================="
echo "🎉 DEPLOYMENT COMPLETE! Your 24/7 Cloud Relay Server is LIVE!"
echo ""
echo "Public IPs:"
flyctl ips list
echo "=========================================================="

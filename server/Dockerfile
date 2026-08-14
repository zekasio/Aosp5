FROM node:20-alpine

WORKDIR /app

COPY relay_server.js .

ENV PORT=7777
ENV HOST=0.0.0.0

EXPOSE 7777/udp

CMD ["node", "relay_server.js"]

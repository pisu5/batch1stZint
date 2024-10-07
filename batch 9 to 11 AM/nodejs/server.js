import http from "http";
const PORT = 3000;

const server = http.createServer((req, res) => {
  res.statusCode == 200;
  res.setHeader("Content-type", "text/plain"); //response
  res.end("Server run success of Node js app");
});
server.listen(PORT, () => {
  console.log(`server run successfully ${PORT}`);
});

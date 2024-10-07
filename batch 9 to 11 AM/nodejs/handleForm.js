import http from "http";
import { parse } from "querystring";
const server = http.createServer((req, res) => {
  if (req.method == "POST" && req.url == "/submit-form") {
    let body = "";

    //data stored in bodty
    req.on("data", (chunk) => {
      body += chunk.toString();
    });
    req.on("end", () => {
      const formdata = parse(body);
      console.log("data received successfuly from fronend...");

      res.writeHead(200, { "content-type": "text-html" });
      res.end(
        `<h1>form data received success</h1><p>name: ${formdata.name} </p> <p>email: ${formdata.email} </p> `
      );
    });
  } else {
    res.writeHead(404, { "content-type": "text-html" });
    res.end(`<h1>sorry data not found</h1>`);
  }
});

server.listen(3000, () => {
  console.log(`server is successfully running on port ${3000}`);
});

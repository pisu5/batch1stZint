import http from "http";
import formidable from "formidable";
import fs from "fs";

const server = http.createServer((req, res) => {
  if (req.method === "POST" && req.url === "/submit-form") {
    const form = formidable({ multiples: true });

    form.parse(req, (err, fields, files) => {
      if (err) {
        res.writeHead(500, { "Content-Type": "text/html" });
        res.end("<h1>Server Error</h1>");
        return;
      }

      const { name, email } = fields;
      const file = files.file[0]; // `files.file` returns an array

      // Log form fields and file info
      console.log("Received Form Data:");
      console.log(`Name: ${name}, Email: ${email}`);
      console.log("File Information:", file); // Contains info about the file (path, size, etc.)

      // Respond with the data received (name, email, and file info)
      res.writeHead(200, { "Content-Type": "text/html" });
      res.end(`
        <h1>Form Data Received</h1>
        <p>Name: ${name}</p>
        <p>Email: ${email}</p>
        <p>File Name: ${file.originalFilename}</p>
        <p>File Size: ${file.size} bytes</p>
      `);
    });
  } else {
    res.writeHead(404, { "Content-Type": "text/html" });
    res.end("<h1>Sorry, page not found</h1>");
  }
});

server.listen(3000, () => {
  console.log("Server is successfully running on port 3000");
});

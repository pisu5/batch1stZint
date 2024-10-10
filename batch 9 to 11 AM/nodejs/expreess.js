import express from "express";
import multer from "multer";
import bodyParser from "body-parser";
import path from "path";
import fs from "fs";
import { fileURLToPath } from "url";

const filename = fileURLToPath(import.meta.url);
const dirName = path.dirname(filename);

// Ensure the uploads directory exists
const uploadDir = path.join(dirName, "uploads");
if (!fs.existsSync(uploadDir)) {
  fs.mkdirSync(uploadDir);
}

const app = express(); //express js

const upload = multer({
  dest: uploadDir,
});

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use(express.static(path.join(dirName, "public")));

app.post("/submit-form", upload.single("file"), (req, res) => {
  const { name, email, password, date } = req.body;
  const file = req.file;
  console.log(name);
  console.log(email);
  console.log(password);
  console.log(file);

  if (!file) {
    return res.status(400).send("File upload failed.");
  }

  res.send("Data sent successfully"); //
});

app.listen(3000, () => {
  console.log("Server running successfully on http://localhost:3000");
});

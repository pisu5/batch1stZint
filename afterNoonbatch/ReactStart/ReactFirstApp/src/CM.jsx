import React, { useState } from "react";

const CM = () => {
  const [comments, setComments] = useState([]); // Array to store comments
  const [newComment, setNewComment] = useState(""); // Input field state

  // Function to handle adding a new comment
  const addComment = (e) => {
    e.preventDefault();
    if (newComment.trim() !== "") {
      setComments([newComment, ...comments]); // Add new comment at the top
      setNewComment(""); // Clear input field
    }
  };

  return (
    <div style={{ maxWidth: "600px", margin: "0 auto", padding: "20px" }}>
      <h2>Facebook-like Comment Section</h2>

      {/* Comment Input Form */}
      <form onSubmit={addComment} style={{ marginBottom: "20px" }}>
        <input
          type="text"
          placeholder="Write a comment..."
          value={newComment}
          onChange={(e) => setNewComment(e.target.value)}
          style={{
            width: "100%",
            padding: "10px",
            fontSize: "16px",
            marginBottom: "10px",
          }}
        />
        <button
          type="submit"
          style={{
            padding: "10px 20px",
            fontSize: "16px",
            backgroundColor: "#4267B2",
            color: "#fff",
            border: "none",
            borderRadius: "5px",
            cursor: "pointer",
          }}
        >
          Post
        </button>
      </form>

      {/* Comment List */}
      <div>
        {comments.length > 0 ? (
          comments.map((comment, index) => (
            <div
              key={index}
              style={{
                color: "crimson",
                background: "#f0f0f0",
                padding: "10px",
                marginBottom: "10px",
                borderRadius: "5px",
              }}
            >
              {comment}
            </div>
          ))
        ) : (
          <p>No comments yet. Be the first to comment!</p>
        )}
      </div>
    </div>
  );
};

export default CM;

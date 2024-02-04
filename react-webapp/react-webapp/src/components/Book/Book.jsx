import React from "react";
import React, { useEffect, useState } from "react";
import axios from "axios";

const Book = () => {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    axios
      .get("/api/books")
      .then((response) => setBooks(response.data))
      .catch((error) => console.error("Error fetching books:", error));
  }, []);

  return (
    <div>
      <h1>Books</h1>
      <ul>
        {books.map((book) => (
          <li key={book.id}>{book.title} </li>
        ))}
      </ul>
    </div>
  );
};

export default Book;

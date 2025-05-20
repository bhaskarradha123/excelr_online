const express = require('express');
const router = express.Router();
const Book = require('../models/bookSchema');

// GET all books
router.get('/', async (req, res) => {
    try {
        const books = await Book.find();
        if (books.length === 0) {
            return res.status(404).json({ message: "No books found" });
        }
        res.status(200).json({ message: "Books fetched successfully", books });
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});
module.exports = router;

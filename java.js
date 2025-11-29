const bookListContainer = document.getElementById('book-list');

// Example book data (could be fetched from an API)
const books = [
    { id: 1, title: 'The Great Gatsby', author: 'F. Scott Fitzgerald', price: 12.99 },
    { id: 2, title: 'To Kill a Mockingbird', author: 'Harper Lee', price: 10.50 },
    { id: 3, title: '1984', author: 'George Orwell', price: 9.75 }
];

function displayBooks(bookArray) {
    bookListContainer.innerHTML = ''; // Clear previous content
    bookArray.forEach(book => {
        const bookItem = document.createElement('div');
        bookItem.className = 'book-item';
        bookItem.innerHTML = `
            <h3>${book.title}</h3>
            <p>Author: ${book.author}</p>
            <p>Price: $${book.price.toFixed(2)}</p>
            <button onclick="addToCart(${book.id})">Add to Cart</button>
        `;
        bookListContainer.appendChild(bookItem);
    });
}

function addToCart(bookId) {
    // Logic to add the book to the shopping cart
    console.log(`Book with ID ${bookId} added to cart.`);
    // In a real application, you would update a cart array or send a request to the backend
}

// Initial display of books
displayBooks(books);
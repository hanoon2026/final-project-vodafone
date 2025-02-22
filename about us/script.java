document.addEventListener("DOMContentLoaded", function () {
    const womanCards = document.querySelectorAll(".woman-card");

    womanCards.forEach(card => {
        card.addEventListener("click", function () {
            // Remove 'selected' class from all cards
            womanCards.forEach(c => c.classList.remove("selected"));
            // Add 'selected' class to the clicked card
            card.classList.add("selected");
        });
    });
});

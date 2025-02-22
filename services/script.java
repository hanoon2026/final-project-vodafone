document.addEventListener("DOMContentLoaded", function () {
    // Smooth Scroll Animation for Sections
    const sections = document.querySelectorAll("section");

    function revealOnScroll() {
        sections.forEach((section) => {
            let sectionTop = section.getBoundingClientRect().top;
            let windowHeight = window.innerHeight;
            if (sectionTop < windowHeight - 50) {
                section.classList.add("fade-in");
            }
        });
    }

    window.addEventListener("scroll", revealOnScroll);
    revealOnScroll();

    // Adding Animation to Icons
    const icons = document.querySelectorAll(".card-body i");

    icons.forEach((icon) => {
        icon.addEventListener("mouseenter", () => {
            icon.classList.add("fa-bounce");
        });

        icon.addEventListener("mouseleave", () => {
            icon.classList.remove("fa-bounce");
        });
    });
});

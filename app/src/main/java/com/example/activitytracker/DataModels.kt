package com.example.activitytracker

data class Category(val name: String)

data class Domain(
    val name: String,
    val categories: List<Category>
)

object DomainData {
    val domains: List<Domain> = listOf(
        Domain(
            name = "Soul",
            categories = listOf(
                Category("Love"),
                Category("Play"),
                Category("Rest"),
                Category("Misc")
            )
        ),
        Domain(
            name = "Ship",
            categories = listOf(
                Category("Sleep"),
                Category("Exercise"),
                Category("Hygiene"),
                Category("Misc")
            )
        ),
        Domain(
            name = "Seas",
            categories = listOf(
                Category("Work"),
                Category("Chores"),
                Category("Admin"),
                Category("Misc")
            )
        )
    )
}

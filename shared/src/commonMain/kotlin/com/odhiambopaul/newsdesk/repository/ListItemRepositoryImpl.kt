package com.odhiambopaul.newsdesk.repository

import com.odhiambopaul.newsdesk.models.ListEntry

class ListItemRepositoryImpl : ListItemRepository {
    override fun listItems(): List<ListEntry> = listOf(
        ListEntry("Title", "This is a subtitle", "https://picsum.photos/100/100"),
        ListEntry("Another title", "This is another subtitle", "https://picsum.photos/100/100"),
        ListEntry("Third one", "And this is the third subtitle", "https://picsum.photos/100/100"),
    )
}
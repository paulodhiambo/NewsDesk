package com.odhiambopaul.newsdesk.repository

import com.odhiambopaul.newsdesk.models.ListEntry

interface ListItemRepository {
    fun listItems(): List<ListEntry>
}
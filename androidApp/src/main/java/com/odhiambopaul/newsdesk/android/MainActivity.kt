package com.odhiambopaul.newsdesk.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.ExperimentalComposeUiApi
import com.odhiambopaul.newsdesk.android.components.ListViewItem
import com.odhiambopaul.newsdesk.android.theme.NewsDeskTheme
import com.odhiambopaul.newsdesk.repository.ListItemRepository
import com.odhiambopaul.newsdesk.repository.ListItemRepositoryImpl
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items


@ExperimentalMaterialApi
@ExperimentalAnimationApi
@ExperimentalComposeUiApi
class MainActivity : AppCompatActivity() {
    private val listRepository: ListItemRepository = ListItemRepositoryImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsDeskTheme {
                LazyColumn() {
                    items(items = listRepository.listItems()) {
                        ListViewItem(
                            title = it.title,
                            subtitle = it.subtitle,
                            imageUrl = R.drawable.sample
                        )
                    }
                }
            }
        }
    }
}
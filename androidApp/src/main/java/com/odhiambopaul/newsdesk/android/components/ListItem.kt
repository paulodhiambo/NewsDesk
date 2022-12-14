package com.odhiambopaul.newsdesk.android.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.odhiambopaul.newsdesk.android.R

@Composable
fun ListViewItem(title: String, subtitle: String, @DrawableRes imageUrl: Int) {
    Card(modifier = Modifier
        .padding(6.dp)
        .clip(shape = RoundedCornerShape(4.dp))
        .fillMaxWidth()) {
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = title, style = MaterialTheme.typography.h6)
                Text(text = subtitle, style = MaterialTheme.typography.subtitle1)
            }
            Image(
                painter = painterResource(id = R.drawable.sample),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
    }

}

@Composable
@Preview
fun PreviewListViewItem() {
    Surface {
        ListViewItem(
            title = "Sample title",
            subtitle = "Subtitle",
            imageUrl = R.drawable.sample
        )
    }
}
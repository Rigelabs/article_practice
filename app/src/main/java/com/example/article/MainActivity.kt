package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun TopImage(modifier: Modifier = Modifier){
    val image= painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}
@Composable
fun Heading(modifier: Modifier = Modifier){
    Text(
        stringResource(R.string.article_heading),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
        )
}
@Composable
fun FirstRow(modifier: Modifier = Modifier){
    Row {
        Text(
            stringResource(R.string.first_row),
            modifier = Modifier.padding(
                start = 16.dp, end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun ThirdRow(modifier: Modifier = Modifier){
    Row {
        Text(
            stringResource(R.string.third_row),
            textAlign =TextAlign.Justify,
            modifier = Modifier.padding(all=16.dp)
        )
    }
}
@Composable
fun Main(modifier: Modifier = Modifier){
    Column {
        TopImage()
        Heading()
        FirstRow()
        ThirdRow()
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        Main()
    }
}
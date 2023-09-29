package com.mazizs.halamanversion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Surface
//import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
//import com.mazizs.halamanversion..ui.theme.HalamanVersionTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Fungsi onCreate ini digunakan untuk mengedit tampilan aktivitas utama dengan menggunakan komponen UI yang telah Anda definisikan dalam MessageCard
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Menggunakan modifier background untuk mengatur warna background
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color(0xFF81C784), Color(0xFFFFFFFF))
                        )
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MessageCard(Message("Version 13.0.10", "Copyright @ 2022-2023 Google"))
            }
        }
    }

    data class Message(val author: String, val body: String)

    @Composable
//Fungsi di bawah ini adalah komponen Composable dalam Jetpack Compose yang digunakan untuk menampilkan gambar, versi, dan tahun.
    fun MessageCard(msg: Message) {
        //Menambahkan padding disekitar message
        Row(modifier = Modifier.padding(all = 8.dp)) {
            //Menambhakan jarak horizontal diantara gambar dan kolom
            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //Menambahkan teks di atas gambar
                Text(
                    text = "Android Version",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                )

                Image(
                    painter = painterResource(R.drawable.android13),
                    contentDescription = "version image",
                    modifier = Modifier
                        // Mengatur gambar sebesar 250 dp
                        .size(250.dp)
                        //Klip gambar untuk membentuk menjadi lingkaran
                        .clip(CircleShape)
                )

                //Menambahkan jarak spasi vertikal diantara gambar dan teks
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = msg.author)
                //Menambahkan jarak spasi vertikal diantara author dan message
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = msg.body)

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Model",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "M2101K7BNY",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Versi Pita Basis",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "MOLY.LR13.R1.MP.V89.6.P48",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "CPU",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "MTK G95 Octa-core Max 2.05 GHz",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Screen Resolution",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "1080 x 2400 pixels",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Versi Kernel",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "4.14.186-perf-gd202b3df1bb5",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )

                //Menambahkan jarak spasi vertikal sebesar 10.dp
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "RAM & Penyimpanan Internal",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                    )
                )
                Text(
                    text = "6,00 GB / 128,00 GB",
                    style = TextStyle(
                        fontSize = 12.sp
                    )
                )
            }
        }
    }

    @Preview
    @Composable
//Fungsi di bawah ini adalah komponen Composable yang digunakan untuk menampilkan
// preview atau pratinjau dari MessageCard dengan data pesan tertentu
    fun PreviewMessageCard() {
        MessageCard(
            msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
}
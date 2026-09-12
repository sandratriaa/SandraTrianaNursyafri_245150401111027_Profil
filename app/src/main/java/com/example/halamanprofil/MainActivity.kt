package com.example.halamanprofil
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Work
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContent{
            HalamanProfil()
        }
    }
}

@Composable
fun HalamanProfil(){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "My Profile",
                fontSize = 26.sp,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(24.dp))

            Image(
                painter = painterResource(id = R.drawable.foto_profil),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Sandra Triana Nursyafri",
                fontSize = 22.sp,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Information System", fontSize = 18.sp
            )

            Text(
                text = "Computer Science", fontSize = 16.sp
            )

            Text(
                text = "Brawijaya University", fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(16.dp)
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = "Education"
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "5th Semester "
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "sandratriana@student.ub.ac.id"
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "sandratriana@student.ub.ac.id"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.Work,
                        contentDescription = "Interest" )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = "Mahasiswa"
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "About Me",
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "As an Information Systems student at the University of Brawijaya, I am deeply passionate about technology and data analysis. My academic journey has equipped me with a strong foundation in IT principles, and I am enthusiastic about leveraging these skills to make meaningful contributions in the tech industry. With a keen interest in data-driven decision-making and innovative technology solutions, I am eager to develop my expertise further and apply my knowledge to real-world challenges. I am particularly interested in roles that involve data analysis, system development, and IT project management. Driven by curiosity and a commitment to continuous learning, I am excited about opportunities that will allow me to grow professionally while contributing to dynamic teams and impactful projects.",
                fontSize = 14.sp,
                textAlign = TextAlign.Justify
            )
        }
    }
}
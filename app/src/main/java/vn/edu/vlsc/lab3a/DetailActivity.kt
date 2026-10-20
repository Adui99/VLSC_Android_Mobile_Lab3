package vn.edu.vlsc.lab3a

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vn.edu.vlsc.lab3a.databinding.ActivityDetailBinding
import vn.edu.vlsc.lab3a.model.Student

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_STUDENT = "vn.edu.vlsc.lab3a.EXTRA_STUDENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        extractAndBindData()
    }

    private fun extractAndBindData() {
        // Validation API Level và ép kiểu an toàn (Type-Safety)
        val student: Student? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(EXTRA_STUDENT, Student::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_STUDENT)
        }

        // Toán tử an toàn Null Safety
        student?.let { st ->
            binding.tvDetailName.text = st.name
            binding.tvDetailMssv.text = getString(R.string.student_mssv, st.mssv)
            binding.imgDetailAvatar.setImageResource(st.avatarRes)

            binding.btnShare.setOnClickListener {
                executeShareIntent(st)
            }
        } ?: run {
            binding.tvDetailName.text = "Lỗi: Khuyết dữ liệu định tuyến."
        }
    }

    private fun executeShareIntent(student: Student) {
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Hồ sơ SV: ${student.name} - ${student.mssv}")
            type = "text/plain"
        }
        val chooser = Intent.createChooser(sendIntent, "Chia sẻ hồ sơ qua:")
        startActivity(chooser)
    }
}

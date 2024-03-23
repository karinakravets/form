package kravets.k.v.form


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kravets.k.v.form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {setContentView(it.root)}
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == binding.radioButton.id) {
                binding.editTextTextEmailAddress2.visibility = View.VISIBLE
            } else {
                binding.editTextTextEmailAddress2.visibility = View.GONE
            }
        }
    }
}
package hamu.kai.com.databindingsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import hamu.kai.com.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
        val viewModel = MainViewModel()

        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
    }
}

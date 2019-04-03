package hamu.kai.com.databindingsample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View

class MainViewModel: ViewModel() {

    var text: MutableLiveData<String> = MutableLiveData()
    private var count = 0

    fun onClick(view: View) {
        count++
        text.value = "count: $count"
    }
}
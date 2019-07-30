package com.nexters.android.pliary.view.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nexters.android.pliary.R
import dagger.android.support.DaggerFragment
import kotlinx.coroutines.*

class SplashFragment : DaggerFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var job = GlobalScope.launch(Dispatchers.Main) {
            delay(3000)
            findNavController().navigate(R.id.homeFragment)
            onDestroy()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}
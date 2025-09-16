package com.example.lab_week_04_76847

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_CAFE_NAME = "cafe_name"

        fun newInstance(cafeName: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val bundle = Bundle()
            bundle.putString(ARG_CAFE_NAME, cafeName)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cafeName = arguments?.getString(ARG_CAFE_NAME) ?: "Unknown"
        view.findViewById<TextView>(R.id.text_cafe_name).text = cafeName
    }
}

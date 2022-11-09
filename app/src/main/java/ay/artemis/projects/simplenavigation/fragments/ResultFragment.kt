package ay.artemis.projects.simplenavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import ay.artemis.projects.simplenavigation.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    private var binding: FragmentResultBinding? = null

    private val args: ResultFragmentArgs by navArgs()
    private var name = ""
    private var age = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentResultBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = args.name
        age = args.age

        binding?.apply {
            tvName.text = name
            tvAge.text = age.toString()

            btnBack.setOnClickListener {
                val directions = ResultFragmentDirections.actionResultFragmentToHomeFragment()
                findNavController().navigate(directions)
            }
        }

    }


}
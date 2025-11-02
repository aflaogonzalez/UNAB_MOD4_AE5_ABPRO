package cl.lte.ae5_abpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cl.lte.ae5_abpro.databinding.FragmentHeaderBinding

class Header : Fragment() {

    private var _binding: FragmentHeaderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHeaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navigateButton.setOnClickListener {
            val searchTerm = binding.searchEditText.text.toString()
            val action = HeaderDirections.actionHeaderFragmentToHomeFragment(searchTerm)
            findNavController().navigate(action)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.searchEditText.text.clear()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
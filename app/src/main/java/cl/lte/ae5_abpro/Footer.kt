package cl.lte.ae5_abpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class Footer : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_footer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.page_1 -> {
                    Toast.makeText(context, "Favoritos", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_2 -> {
                    Toast.makeText(context, "Música", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_3 -> {
                    Toast.makeText(context, "Lugares", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.page_4 -> {
                    Toast.makeText(context, "Noticias", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = Footer()
    }
}
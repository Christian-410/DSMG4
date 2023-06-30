package project.dsm_g4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hu10_metodo_envio)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
        add<FragmentoRetiroTienda>(androidx.fragment.R.id.fragment_container_view_tag)
        }

    }
}
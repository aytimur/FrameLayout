package ibrahim.aytimur.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frameLayout3.setOnClickListener {
            frameLayout2.visibility = View.VISIBLE
            frameLayout3.visibility = View.INVISIBLE
            frameLayout1.visibility = View.INVISIBLE
        }
        frameLayout2.setOnClickListener {
            frameLayout1.visibility = View.VISIBLE
            frameLayout2.visibility = View.INVISIBLE
            frameLayout3.visibility = View.INVISIBLE
        }
        frameLayout1.setOnClickListener {
            frameLayout3.visibility = View.VISIBLE
            frameLayout2.visibility = View.INVISIBLE
            frameLayout1.visibility = View.INVISIBLE
        }
    }
}

package ge.bitcamp.bitcampcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val minusBtn = findViewById<Button>(R.id.minusBtn)
        val plusBtn = findViewById<Button>(R.id.plusBtn)

        plusBtn.setOnClickListener {
            // ამ ნაწილში ღილაკზე უკვე დაჭერილია
            add()
            counterTextView.text = count.toString()
        }

        minusBtn.setOnClickListener {
            // ამ ნაწილში ღილაკზე უკვე დაჭერილია
            minus()
            counterTextView.text = count.toString()
        }
    }

    fun add() {
        count++
    }

    fun minus() {
        if (count > 0){
            count--
        }
    }

}
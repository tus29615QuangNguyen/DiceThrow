package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = DieFragment.newInstance(12)


        supportFragmentManager.beginTransaction().add(R.id.diceContainer, fragment1).commit()

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
            (supportFragmentManager.findFragmentById(R.id.diceContainer) as DieFragment)
                .throwDie()
        }

    }
}
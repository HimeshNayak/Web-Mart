# Web Mart

## Working of the app
Currently the app displays a text in the main activity and shows a pop up when back button is pressed.

onBackPressed() is overriden for achieving this
```
override fun onBackPressed() {
    val builder = AlertDialog.Builder(this)
    builder.setTitle("Exit App?")
    builder.setMessage("Do you really want to exit app?")

    builder.setPositiveButton(R.string.yes) { _, _ ->        
        // App Closes and a toast is shown
        Toast.makeText(applicationContext,
                R.string.exitText, Toast.LENGTH_SHORT).show()

        // When Positive button is pressed then only the app will be closed
        super.onBackPressed()
    }

    builder.setNegativeButton(R.string.no) { _, _ ->
        // If Negative Button is tapped Alert will close and show a toast
        Toast.makeText(applicationContext,
                R.string.stayText, Toast.LENGTH_SHORT).show()
    }

    builder.show()

}
```

## Screen Shot of the app
![Main Screen](https://github.com/HimeshNayak/Web-Mart/blob/master/app/ss1.png)
![Main Screen](https://github.com/HimeshNayak/Web-Mart/blob/master/app/ss2.png)

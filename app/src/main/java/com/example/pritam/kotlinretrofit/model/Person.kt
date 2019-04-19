package com.example.pritam.kotlinretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Person {
    @SerializedName("name")
    @Expose
    var name:String? = null
    @SerializedName("email")
    @Expose
    var email:String? = null
    @SerializedName("contact")
    @Expose
    var contact:String? = null
    @SerializedName("age")
    @Expose
    var age:String? = null
    @SerializedName("image")
    @Expose
    var image:String? = null

    override fun toString(): String {
        return "Person(name=$name, email=$email, contact=$contact, age=$age,image=$image)"
    }
}


/*
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.label_indeterminate -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setLabel("Please wait")
                    .setCancellable {
                        Toast.makeText(
                            this@MainActivity, "You " + "cancelled manually!", Toast
                                .LENGTH_SHORT
                        ).show()
                    }

                scheduleDismiss()
            }
            R.id.indeterminate -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                scheduleDismiss()
            }
            R.id.detail_indeterminate -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setLabel("Please wait")
                    .setDetailsLabel("Downloading data")
                scheduleDismiss()
            }
            R.id.grace_indeterminate -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setGraceTime(1000)
                scheduleDismiss()
            }
            R.id.determinate -> {

                hud = KProgressHUD.create(this@MainActivity)
                    .setStyle(KProgressHUD.Style.PIE_DETERMINATE)
                    .setLabel("Please wait")
                simulateProgressUpdate()
            }
            R.id.annular_determinate -> {

                hud = KProgressHUD.create(this@MainActivity)
                    .setStyle(KProgressHUD.Style.ANNULAR_DETERMINATE)
                    .setLabel("Please wait")
                    .setDetailsLabel("Downloading data")
                simulateProgressUpdate()
            }
            R.id.bar_determinate -> {

                hud = KProgressHUD.create(this@MainActivity)
                    .setStyle(KProgressHUD.Style.BAR_DETERMINATE)
                    .setLabel("Please wait")
                simulateProgressUpdate()
            }
            R.id.custom_view -> {

                val imageView = ImageView(this)
                imageView.setBackgroundResource(R.drawable.spin_animation)
                val drawable = imageView.background as AnimationDrawable
                drawable.start()
                hud = KProgressHUD.create(this)
                    .setCustomView(imageView)
                    .setLabel("This is a custom view")
                scheduleDismiss()
            }
            R.id.dim_background -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setDimAmount(0.5f)
                scheduleDismiss()
            }
            R.id.custom_color_animate -> {

                hud = KProgressHUD.create(this)
                    .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                    .setWindowColor(resources.getColor(R.color.colorPrimary))
                    .setAnimationSpeed(2)
                scheduleDismiss()
            }
            else -> {
                Toast.makeText(this@MainActivity, "Its Else !", Toast.LENGTH_SHORT).show()
            }
        }
        hud?.show()
    }

    private fun scheduleDismiss() {
        val handler = Handler()
        handler.postDelayed({ hud?.dismiss() }, 2000)
    }

    private fun simulateProgressUpdate() {
        hud?.setMaxProgress(100)
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            internal var currentProgress: Int = 0
            override fun run() {
                currentProgress += 1
                hud?.setProgress(currentProgress)
                if (currentProgress == 80) {
                    hud?.setLabel("Almost finish...")
                }
                if (currentProgress < 100) {
                    handler.postDelayed(this, 50)
                }
            }
        }, 100)
    }*/
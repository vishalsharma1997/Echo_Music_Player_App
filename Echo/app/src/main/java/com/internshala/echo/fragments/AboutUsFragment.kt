package com.internshala.echo.fragments


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import com.internshala.echo.R


/**
 * A simple [Fragment] subclass.
 */
class AboutUsFragment : Fragment() {

    var myActivity: Activity? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        activity.title = "About Us"
        return inflater!!.inflate(R.layout.fragment_about_us, container, false)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        myActivity = context as Activity
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        myActivity = activity
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

        override fun onPrepareOptionsMenu(menu: Menu?) {
            super.onPrepareOptionsMenu(menu)
            val item = menu?.findItem(R.id.action_sort)
            item?.isVisible = false
        }
    }// Required empty public constructor

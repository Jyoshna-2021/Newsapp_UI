package com.example.demonews

import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var ListAdapter:listitemadapter?=null
    private var CatagoryAdapter: catagoryadapter? = null
    private var useradapter: UserADAPTER? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rcv_1 = findViewById<RecyclerView>(R.id.recycle_view_1)
       val rcv_2 = findViewById<RecyclerView>(R.id.recycle_view_2)
        val rcv_3=findViewById<RecyclerView>(R.id.recycle_view_3)
        val rcv_4=findViewById<RecyclerView>(R.id.recycle_view_4)
        val rcv_5=findViewById<RecyclerView>(R.id.recycle_view_5)
        val rcv_6=findViewById<RecyclerView>(R.id.recycle_view_6)
        val rcv_7=findViewById<RecyclerView>(R.id.recycle_view_7)
        val rcv_8=findViewById<RecyclerView>(R.id.recycle_view_8)
        val rcv_9=findViewById<RecyclerView>(R.id.recycle_view_9)
        val rcv_10=findViewById<RecyclerView>(R.id.recycle_view_10)


        ListAdapter = listitemadapter()
        val layoutManager = LinearLayoutManager(this, )
        rcv_1.setLayoutManager(layoutManager)
        rcv_1.setFocusable(false)
        rcv_1.setNestedScrollingEnabled(false)
        ListAdapter!!.setData(listitemcatagory)
        rcv_1.setAdapter(ListAdapter)


        val linearlayoutManager = LinearLayoutManager(this, )
        rcv_3.setLayoutManager(linearlayoutManager)
        rcv_3.setFocusable(false)
        rcv_3.setNestedScrollingEnabled(false)
        ListAdapter!!.setData(listitemcatagory)
        rcv_3.setAdapter(ListAdapter)


        val linear_layoutManager = LinearLayoutManager(this, )
        rcv_5.setLayoutManager(linear_layoutManager)
        rcv_5.setFocusable(false)
        rcv_5.setNestedScrollingEnabled(false)
        ListAdapter!!.setData(listitemcatagory)
        rcv_5.setAdapter(ListAdapter)


        val linear_layout_Manager = LinearLayoutManager(this, )
        rcv_7.setLayoutManager(linear_layout_Manager)
        rcv_7.setFocusable(false)
        rcv_7.setNestedScrollingEnabled(false)
        ListAdapter!!.setData(listitemcatagory)
        rcv_7.setAdapter(ListAdapter)

        val linear_layout_Manager_1 = LinearLayoutManager(this, )
        rcv_9.setLayoutManager(linear_layout_Manager_1)
        rcv_9.setFocusable(false)
        rcv_9.setNestedScrollingEnabled(false)
        ListAdapter!!.setData(listitemcatagory)
        rcv_9.setAdapter(ListAdapter)

        CatagoryAdapter = catagoryadapter()
        val gridLayoutManager = GridLayoutManager(this, 2)
        rcv_2.setLayoutManager(gridLayoutManager)
        rcv_2.setFocusable(false)
        rcv_2.setNestedScrollingEnabled(false)
        CatagoryAdapter!!.setData(listCategory)
        rcv_2.setAdapter(CatagoryAdapter)


        val gridlayoutManager = GridLayoutManager(this, 2)
        rcv_6.setLayoutManager(gridlayoutManager)
        rcv_6.setFocusable(false)
        rcv_6.setNestedScrollingEnabled(false)
        CatagoryAdapter!!.setData(listCategory)
        rcv_6.setAdapter(CatagoryAdapter)

        val grid_layoutManager = GridLayoutManager(this, 2)
        rcv_10.setLayoutManager(grid_layoutManager)
        rcv_10.setFocusable(false)
        rcv_10.setNestedScrollingEnabled(false)
        CatagoryAdapter!!.setData(listCategory)
        rcv_10.setAdapter(CatagoryAdapter)


        useradapter = UserADAPTER()
        val linearLayoutManager = LinearLayoutManager(this)
        rcv_4.setLayoutManager(linearLayoutManager)
        rcv_4.setFocusable(false)
        rcv_4.setNestedScrollingEnabled(false)
        useradapter!!.setData(listuser)
        rcv_4.setAdapter(useradapter)

        val linear_LayoutManager = LinearLayoutManager(this)
        rcv_8.setLayoutManager(linear_LayoutManager)
        rcv_8.setFocusable(false)
        rcv_8.setNestedScrollingEnabled(false)
        useradapter!!.setData(listuser)
        rcv_8.setAdapter(useradapter)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        val  menuItem= menu!!.findItem(R.id.search_action)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    private val listitemcatagory: List<listitem>
        private get() {
            val list: MutableList<listitem> = ArrayList()
            list.add(listitem(R.drawable.new1, "Europe situation has raised questions about stability of international order, says PM Modi at BIMSTEC summit"))
            return list
        }

    private val listuser: List<user>
        private get() {
            val list: MutableList<user> = ArrayList()
            list.add(user(R.drawable.new2, "Challenge Bail For Minister's Son, Farmers' Killing Probe Chief Tells UP"))
            list.add(user(R.drawable.new3, "Covid situation in world"))
            list.add(user(R.drawable.new4, "Today World news headline"))
            list.add(user(R.drawable.news5, "Election situation in West bangol"))
            return list
        }
    private val listCategory: List<catagory>
        private get() {
            val list: MutableList<catagory> = ArrayList()
            list.add(catagory(R.drawable.news5, "Election situation in West bangol"))
            list.add(catagory(R.drawable.new4, "Today World news headline"))
            list.add(catagory(R.drawable.new3, "Covid situation in world"))
            list.add(catagory(R.drawable.new2, "Challenge Bail For Minister's Son, Farmers' Killing Probe Chief Tells UP"))
            return list
        }
}
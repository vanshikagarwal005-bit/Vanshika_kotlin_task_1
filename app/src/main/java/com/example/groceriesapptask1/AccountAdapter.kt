package com.example.groceriesapptask1
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AccountAdapter (private val datalist:ArrayList<AccountItem>): RecyclerView.Adapter<AccountAdapter.ViewHolderClass>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderClass {
   val itemView=
       LayoutInflater.from(parent.context).inflate(R.layout.activity_account_item,parent,false)
       return ViewHolderClass(itemView)

    }

    override fun onBindViewHolder(
        holder: ViewHolderClass,
        position: Int
    ) {
        val currentItem = datalist[position]
        holder.itemIcon.setImageResource(currentItem.icon)
        holder.itemTitle.text = currentItem.title
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    annotation class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemIcon: ImageView = itemView.findViewById(R.id.itemIcon)
        val itemTitle: TextView = itemView.findViewById(R.id.itemTitle)
        val itemArrow: TextView = itemView.findViewById(R.id.itemArrow)

    }

}
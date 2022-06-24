package com.example.mytodolist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytodolist.Model.TodoInfo
import com.example.mytodolist.databinding.ListItemModelBinding

class Todoadapter : RecyclerView.Adapter<Todoadapter.TodoViewHolder>() {

    private var listTodo : ArrayList<TodoInfo> = ArrayList()

    init{
        //리스트 아이템 인스턴스 생성
        val todoItem = TodoInfo()
        todoItem.todoContent = "컴퓨터 사용시간 줄이기"
        todoItem.todoDate = "2022-06-21 22:22"
        listTodo.add(todoItem)

        val todoItem1 = TodoInfo()
        todoItem1.todoContent = "컴퓨터 사용시간 줄이기12"
        todoItem1.todoDate = "2022-06-21 22:22"
        listTodo.add(todoItem1)
        val todoItem2 = TodoInfo()
        todoItem2.todoContent = "컴퓨터 사용시간 줄이기22"
        todoItem2.todoDate = "2022-06-21 22:22"
        listTodo.add(todoItem2)

    }

    class TodoViewHolder(private val binding : ListItemModelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(todoItem: TodoInfo) {
            binding.tvContent.setText(todoItem.todoContent)
            binding.tvDate.setText(todoItem.todoDate)
            binding.btnRemove.setOnClickListener {

            }
        }
    }
    //뷰홀더 생성.(각 리스트 아이템 1개씩 마다 이 오버라이드 메소드가 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = ListItemModelBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return TodoViewHolder(binding)
    }
    //뷰홀더가 바인디 이루어 질 때 해줘야 될 처리들을 구현
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(listTodo[position])
    }

    override fun getItemCount(): Int {
        return listTodo.size
    }

}
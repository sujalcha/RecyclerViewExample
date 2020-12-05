package com.xtha.zujal.recyclerviewexample.datasource


import com.example.retrofittest.model.Post

class DataSource {

    companion object{

        var list = ArrayList<Post>()

        fun createDataSet(): ArrayList<Post>{
            list.add(
                Post(
                    1,
                    1,
                    "Title 1",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    2,
                    "Title 2",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    3,
                    "Title 3",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    4,
                    "Title 4",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    5,
                    "Title 5",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    6,
                    "Title 6",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    7,
                    "Title 7",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    8,
                    "Title 8",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    9,
                    "Title 9",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )
            list.add(
                Post(
                    1,
                    10,
                    "Title 10",
                    "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
                )
            )

            return list
        }
    }

}
package com.example.todolist.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.domain.Todo
import com.example.todolist.domain.todo1
import com.example.todolist.domain.todo2
import com.example.todolist.ui.theme.ToDoListTheme

@Composable
fun TodoItem(
    todo: Todo,
    onCompletedChange: (Boolean) -> Unit,
    onItemClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier
    ) {
    Surface(
        onClick = onItemClick,
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        tonalElevation = 1.dp,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = todo.isCompleted,
                onCheckedChange = onCompletedChange,
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = todo.title,
                    style = MaterialTheme.typography.titleLarge
                )

                todo.description?.let {

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = todo.description,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = onDeleteClick
            ) {
                Icon(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = "Delete"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoItemPreview() {
    ToDoListTheme {
        TodoItem(
            todo = todo1,
            onCompletedChange = {},
            onItemClick = {},
            onDeleteClick = {}
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TodoItemCompletedPreview() {
    ToDoListTheme {
        TodoItem(
            todo = todo2,
            onCompletedChange = {},
            onItemClick = {},
            onDeleteClick = {}
        )
    }
}

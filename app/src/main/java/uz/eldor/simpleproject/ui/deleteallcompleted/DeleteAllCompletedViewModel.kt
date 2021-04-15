package uz.eldor.simpleproject.ui.deleteallcompleted

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import uz.eldor.simpleproject.data.TaskDao
import uz.eldor.simpleproject.di.ApplicationScope

class DeleteAllCompletedViewModel @ViewModelInject constructor(
    private val  taskDao: TaskDao,
    @ApplicationScope val applicationScope: CoroutineScope
) : ViewModel() {

    fun onConfirmClick() = applicationScope.launch {
        taskDao.deleteCompletedTasks()
    }
}
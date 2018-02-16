var app = angular.module('myApp',[]);

//use sessionStorage inplace of localStorage if you want to stored data to be deleted when the window is closed
app.controller("myCtrl", function(){
    vm = this
    vm.array1 = []

    var taskData = sessionStorage['tasksList2'];
    if(taskData !== undefined) {
        vm.array1 = JSON.parse(taskData);
    }

    vm.addTask= function() {
        vm.array1.push({"title": vm.newTodo, 'status': false})
        vm.newTodo = ''
        sessionStorage['tasksList2'] = JSON.stringify(vm.array1)
        //console.log(sessionStorage)
    }
    vm.contentEdit = function(todo){
        event.target.contentEditable = event.target.contentEditable=='false' ? 'true' : 'false'
        todo.title = event.target.innerText
        vm.updateChange();
    }
//so that the editable element becomes on uneditable when user presses 'enter' key
    vm.pressEnter = function(todo) {
        //console.log(event.which || event.keyCode);
        if(event.which == 13 && todo.title != "") {
            vm.contentEdit(todo);
        }
    }

    vm.updateChange = function(){
        sessionStorage['tasksList2'] = JSON.stringify(vm.array1)
    }

    vm.clearCompleted= function() {
        vm.array1 = vm.array1.filter((obj)=>(!obj.status))
        sessionStorage['tasksList2'] = JSON.stringify(vm.array1)
    }

});




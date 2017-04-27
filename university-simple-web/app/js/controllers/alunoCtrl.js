(function () {
  'use strict';


  angular.module('ngApp').controller("alunoCtrl", function ($scope, alunosAPI, cursosAPI) {

    $scope.isUpdate = false;

    $scope.getAlunos = function(){
      alunosAPI.getAlunos().then(function (response){
        $scope.alunos = response.data;
      }, function(response){
        alert("Erro ao buscar alunos");
      });
    };
      cursosAPI.getCursos().then(function (response){
        $scope.cursos = response.data;
      }, function(response){
        alert("Erro ao buscar cursos");
      });

    $scope.deletar = function (aluno) {
        alunosAPI.deleteAluno(aluno).then(function (response){
          alert("Aluno Deletado");
          $scope.getAlunos();
        }, function(response){
          alert("Erro ao deletar aluno")
        });
    };

    $scope.editar = function (aluno) {
        $scope.aluno = aluno;
        $scope.isUpdate = true;
    };

    $scope.cadastraNovo = function(aluno){
      aluno.cursoId = aluno.cursoId.id;
      alunosAPI.saveAluno(aluno).then(function (response){
        $scope.aluno = {};
        $scope.getAlunos();
      angular.element('#MyModal').modal('hide');
      }, function(response){
        alert("Erro ao buscar cursos");
      });
    }

  });


})();

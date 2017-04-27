(function () {
  'use strict';


  angular.module('ngApp').controller("cursoCtrl", function ($scope, cursosAPI) {

    $scope.isUpdate = false;
    $scope.curso = {};

    $scope.getCursos = function(){
      cursosAPI.getCursos().then(function (response){
        $scope.cursos = response.data;
      }, function(response){
        alert("Erro ao buscar cursos");
      });
    };

    $scope.cadastrarCurso = function(curso){
      if(curso.id){
        cursosAPI.updateCurso(curso).then(function (response){
          angular.element('#MyModalCursos').modal('hide');
          $scope.getCursos();
          $scope.isUpdate = false
        }, function(response){
          alert("Erro ao cadastrar curso");
        });
      }
      cursosAPI.saveCurso(curso).then(function (response){
        angular.element('#MyModalCursos').modal('hide');
        $scope.getCursos();
        $scope.curso = {};
      }, function(response){
        alert("Erro ao cadastrar curso");
      });
    };

    $scope.deletarCurso = function (id) {
        cursosAPI.deleteCurso(id).then(function (response){
          alert("Curso Deletado");
          $scope.getCursos();
        }, function(response){
          alert("Erro ao deletar Curso")
        });
    };

    $scope.editar = function (curso) {
      $scope.curso = curso;
      angular.element('#MyModalCursos').modal('show');
    };

  });

})();

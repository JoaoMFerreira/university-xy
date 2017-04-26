(function () {
  'use strict';
  
  angular.module("ngApp").service("alunosAPI", function ($http, config) {
    var _getAlunos = function () {
  		return $http.get(config.baseUrl + "/aluno");
  	};

  	var _saveAluno = function (aluno) {
  		return $http.post(config.baseUrl + "/aluno", aluno);
  	};
    
    var _deleteAluno = function (aluno) {
  		return $http.delete(config.baseUrl + "/aluno" + "/" +aluno.id.cpf + "/" + aluno.id.matricula );
    };
  	return {
  		getAlunos: _getAlunos,
  		saveAluno: _saveAluno,
      deleteAluno: _deleteAluno
  	};
  });
  
  })();
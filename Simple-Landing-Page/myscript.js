function verificaintegridade(){
    verificarDados();
    verificarEmail();
    tamanhoMensagem();
    emprego();
}


function verificarDados(){
    const nome = document.getElementById('nome').value;
    if(nome.length < 3){
        document.querySelector('nome').style.color = "red";
        return false;
    }else{
        console.log("ok");
        return true;
    }
}
    function verificarEmail(){
    const email = document.getElementById('email').value;
    const emailRegex = new RegExp(/^[a-z0-9.]+@[a-z0-9]+\.[a-z]+\.([a-z]+)?$/i);
    emailRegex.test(email) ? console.log('emailok') : console.log('erroremail');
}
    function tamanhoMensagem(){
        const mensagem = document.getElementById('mensagem').value;
        if(mensagem.length > 240){
            alert("tamanho máximo 240 caracteres")
        }else{
            console.log('okmensagem');
        }
    }
    function emprego(){
        const situation = document.getElementById('job').value;
        console.log(situation);
    }






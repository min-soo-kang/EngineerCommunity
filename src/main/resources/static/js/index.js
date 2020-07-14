let index = {
    init : function() {
        const _this = this;
        $("#btn_save").on("click", function() {
            _this.save();
        });

    },
    save : function() {
        let data = {
            title:$("#title").val(),
            author:$("#author").val(),
            content:$("#content").val()
        };

        $.ajax({
            type:"POST",
            url:"/api/posts",
            dataType:"json",
            contentType:"application/json; charset=utf-8",
            data:JSON.stringify(data)
        }).done(function() {
            alert("성공");
            window.location.href ="/";
        }).fail(function(e) {
            alert(JSON.stringify(e));
        });

    }
};


index.init();

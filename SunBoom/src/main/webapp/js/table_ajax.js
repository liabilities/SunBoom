function GetMultiLineSelectTable(tableId, selectIds) {
    var table = $(tableId);
    var url = table.data('url');
    var ischeckbox = false;
    //获取数据项名称
    var fileds = new Array();
    table.children('thead').children('tr').children('th').each(function (index, el) {
        var type = 'Content';
        if ($(this).data('type')) type = $(this).data('type');
        if (type == 'Content') {
            var field = $(this).data('field');
            fileds[index] = field;
        }
        else if (type == 'CheckBox') {
            ischeckbox = true;
        }
    });
    $.ajax({
        url: url,
        type: 'post',
        dataType: 'json',
    })
        .done(function (json) {
            //向表格内新增内容
            var tbody = '';
            $.each(json, function (index, el) {
                var tr = "<tr>";
                if (ischeckbox) {//生成复选按钮
                    //tr+='<td><div class="checker"><span><input class="checkboxes" type="checkbox"></span></div></td>'
                    tr += '<td><input type="checkbox"></td>'
                }
                $.each(fileds, function (i, el) {//生成内容
                    if (fileds[i]) {
                        tr += '<td>' + formatJsonData(json[index][fileds[i]]) + '</td>';
                    }
                });
                tr += "</tr>";
                tbody += tr;
            });
            table.children('tbody').empty();
            table.children('tbody').append(tbody);//显示数据
            if (selectIds) {//将需要选中的行设为选中状态
                selectIds.each(function (index, el) {
                    //建设中
                });
            }
            table.children('tbody').addClass('sel');
            table.children('tbody.sel').children('tr').click(function (event) {//点击行事件
                $(this).toggleClass('active');//增加选中效果
                if (ischeckbox) $(this).find('input[type="checkbox"]').attr('checked', $(this).hasClass('active'));//选择复选框
            });

        }).fail(function () {
        alert("Err");
    });
}
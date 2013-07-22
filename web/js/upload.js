/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
                           
                            $('#fileupload').fileupload({
                                dataType: 'json',
                                done: function(e, data) {
                                    $.each(data.result, function(index, file) {
                                        $("#img").attr("src", "/bibliotheque" + file.path);
                                                                     
                                        $(PrimeFaces.escapeClientId('form:photo')).val(file.path);
                                    });
                                },
                                progressall: function(e, data) {
                                    var progress = parseInt(data.loaded / data.total * 100, 10);
                                    $('#progress .bar').css(
                                            'width',
                                            progress + '%'
                                            );
                                },
                                dropZone: $('#dropzone')
                            });
                        });

<script type="text/ng-template" id="addWafModal.html">
    <div class="modal-header">
        <h4 id="myModalLabel">Add WAF</h4>
    </div>
    <div ng-form="form" id="addWafDivInForm" class="modal-body">
        <table class="modal-form-table">
            <tr>
                <td>WAF</td>
                <td class="inputValue">
                    <select ng-model="object.waf.id" id="wafSelect" name="waf.id">
                        <option ng-repeat="waf in config.wafList"
                                ng-selected="object.waf.id === waf.id"
                                value="{{ waf.id }}">
                            {{ waf.name }}
                        </option>
                    <select>
                    <button class="btn" id="addWafButtonInModal" ng-click="switchTo('createWaf')">Create New WAF</button>
                </td>
            </tr>
        </table>
    </div>
    <%@ include file="/WEB-INF/views/modal/footer.jspf" %>
</script>
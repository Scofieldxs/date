<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<#include "../commons/taglib.ftl">
<div class="page-mod">
    <span class="result">共 <b>${pager.total}</b> 个结果</span>
    <div class="page">

        <%--<c:when test="${curPageNum eq pageNumber}">--%>
            <%--<a class="cur" href="${pageUrl}">${pageNumber}</a>--%>
        <%--</c:when>--%>
        <c:forEach var="page" items="${pager.navigatePageNumbers}">
            <%--<a class="prev-dis" href="">${page}</a>--%>
            <c:choose>
                <c:when test="${page == pager.pageNumber}">
                    <a class="cur" href="${page}">${page}</a>
                </c:when>
                <c:otherwise>
                    <a href="${page}">${page}</a>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <a class="next" href="">&gt;</a>






    </div>
</div>
<script type="text/javascript">
</script>

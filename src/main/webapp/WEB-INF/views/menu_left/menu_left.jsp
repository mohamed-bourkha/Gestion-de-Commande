   
  
  <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="javascript:void();">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Gestion de commande</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - home -->
      <c:url value="/home/" var="home"/>
      <li class="nav-item">
        <a class="nav-link" href="${home }">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span><fmt:message key="common.dashbord"></fmt:message></span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Interface
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <c:url value="/article/" var="article"/>
      <li class="nav-item">
        <a class="nav-link collapsed" href="${article }" data-toggle="collapse"  aria-expanded="true" >
          <i class="fas fa-fw fa-table"></i>
          <span><fmt:message key="common.article"></fmt:message></span>
        </a>
      </li>

      <!-- Nav Item - Clients est ses commandes -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-folder"></i>
          <span><fmt:message key="common.client"></fmt:message></span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
	      <c:url value="/client/" var="client"/>
            <a class="collapse-item" href="${client }"><fmt:message key="common.client"></fmt:message></a>
            <c:url value="/commandeclient/" var="cdeclient"/>
           	<a class="collapse-item" href="${cdeClient }"><fmt:message key="common.client.commande"></fmt:message></a>
          </div>
        </div>
      </li>
		
	 <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-folder"></i>
          <span><fmt:message key="common.fournisseur"></fmt:message></span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
          <c:url value="/fournisseur/" var="fournisseur"/>
           	<a class="collapse-item" href="${fournisseur }"><fmt:message key="common.fournisseur"></fmt:message></a>
           	<c:url value="/commandefournisseur/" var="fournisseur"/>
           	<a class="collapse-item" href="${fournisseur }"><fmt:message key="common.fournisseur.commande"></fmt:message></a>
          </div>
        </div>
      </li>
      
        <!-- Nav Item - Stock-->
        <c:url value="/stock/" var="stock"/>
      <li class="nav-item">
        <a class="nav-link" href="charts.html">
          <i class="fas fa-fw fa-chart-area"></i>
          <span><fmt:message key="common.stock"></fmt:message></span></a>
      </li>
 
      <!-- Nav Item - Vente -->
      <c:url value="/vente/" var="vente"/>
      <li class="nav-item">
        <a class="nav-link" href="tables.html">
          <i class="fas fa-fw fa-table"></i>
          <span><fmt:message key="common.vente"></fmt:message></span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span><fmt:message key="common.parametrage"></fmt:message></span>
        </a>
        <div id="collapseTwo" class="collapse show" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
        <div class="bg-white py-2 collapse-inner rounded">
        <c:url value="/utilisateur/" var="utlisateur"/>
            <a class="collapse-item" href="${user }"><fmt:message key="common.parametrage.utilisateur"></fmt:message></a>
        <c:url value="/category/" var="category"/>   
           	<a class="collapse-item" href="${category }"><fmt:message key="common.parametrage.category"></fmt:message></a>
          </div>
          </div>
      </li>
      

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
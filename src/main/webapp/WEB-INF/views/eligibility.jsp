<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:eval expression="@propertyConfigurer.getProperty('cdn.url')" var="cdnUrl" />

<!DOCTYPE html>
<!--[if lt IE 9]><html class="lte-ie8" lang="en"><![endif]-->
<!--[if gt IE 8]><!--><html lang="en"><!--<![endif]-->
  <head>
    <meta charset="utf-8" />
    <title>
   File abridged accounts
</title>

    <!--[if gt IE 8]><!--><link href="${cdnUrl}/style/assets-digital-cabinet-office-gov-uk-static/govuk-template.css" media="screen" rel="stylesheet" type="text/css" /><!--<![endif]-->
    <!--[if IE 6]><link href="${cdnUrl}/style/assets-digital-cabinet-office-gov-uk-static/govuk-template-ie6.css" media="screen" rel="stylesheet" type="text/css" /><![endif]-->
    <!--[if IE 7]><link href="${cdnUrl}/style/assets-digital-cabinet-office-gov-uk-static/govuk-template-ie7.css" media="screen" rel="stylesheet" type="text/css" /><![endif]-->
    <!--[if IE 8]><link href="${cdnUrl}/style/assets-digital-cabinet-office-gov-uk-static/govuk-template-ie8.css" media="screen" rel="stylesheet" type="text/css" /><![endif]-->
    <link href="${cdnUrl}/style/assets-digital-cabinet-office-gov-uk-static/govuk-template-print.css" media="print" rel="stylesheet" type="text/css" />

    <!--[if IE 8]>
    <script>
      (function(){if(window.opera){return;}
       setTimeout(function(){var a=document,g,b={families:(g=
       ["nta"]),urls:["/public/stylesheets/fonts-ie8.css?0.17.3"]},
       c="/public/javascripts/vendor/goog/webfont-debug.js?0.17.3",d="script",
       e=a.createElement(d),f=a.getElementsByTagName(d)[0],h=g.length;WebFontConfig
       ={custom:b},e.src=c,f.parentNode.insertBefore(e,f);for(;h=h-1;a.documentElement
       .className+=' wf-'+g[h].replace(/\s/g,'').toLowerCase()+'-n4-loading');},0)
      })()
    </script>
    <![endif]-->
    <!--[if gte IE 9]><!--><link href="${cdnUrl}/style/fonts.css" media="all" rel="stylesheet" type="text/css" /><!--<![endif]-->
    <!--[if lt IE 9]><script src="${cdnUrl}/script/vendor/assets-digital-cabinet-office-gov-uk-static/ie.js"></script><![endif]-->

    <link rel="shortcut icon" href="${cdnUrl}/images/favicon.ico?0.17.3" type="image/x-icon" />
    <link rel="mask-icon" href="${cdnUrl}/images/gov.uk_logotype_crown.svg?0.17.3" color="#0b0c0c">
    <link rel="apple-touch-icon-precomposed" sizes="152x152" href="${cdnUrl}/images/apple-touch-icon-152x152.png?0.17.3">
    <link rel="apple-touch-icon-precomposed" sizes="120x120" href="${cdnUrl}/images/apple-touch-icon-120x120.png?0.17.3">
    <link rel="apple-touch-icon-precomposed" sizes="76x76" href="${cdnUrl}/images/apple-touch-icon-76x76.png?0.17.3">
    <link rel="apple-touch-icon-precomposed" href="${cdnUrl}/images/apple-touch-icon-60x60.png?0.17.3">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta property="og:image" content="${cdnUrl}/images/opengraph-image.png?0.17.3">

    
<link href="${cdnUrl}/style/application.css" media="screen" rel="stylesheet" type="text/css" />
<link href="${cdnUrl}/style/ch-accounts.css media="screen" rel="stylesheet" type="text/css" />
<link href="${cdnUrl}/style/chs-hacked-styles.css" media="screen" rel="stylesheet" type="text/css" />



  </head>

  <body class="">
    <script>document.body.className = ((document.body.className) ? document.body.className + ' js-enabled' : 'js-enabled');</script>

    

    <div id="skiplink-container">
      <div>
        <a href="#content" class="skiplink">Skip to main content</a>
      </div>
    </div>

    <div id="global-cookie-message">

        
  <p>GOV.UK uses cookies to make the site simpler. <a href="#" title="Find out more about cookies">Find out more about cookies</a></p>


    </div>


    <header role="banner" id="global-header" class="
  <!-- blank to remove the proposition header -->
">
      <div class="header-wrapper">
        <div class="header-global">
          <div class="header-logo">
            <a href="/index" title="Go to the GOV.UK homepage" id="logo" class="content">
              Companies House
            </a>
          </div>
          
        </div>
        
  <!-- blank to remove the proposition header -->

      </div>
    </header>


    

    <div id="global-header-bar"></div>

<main id="page-container" role="main" class="two-column-accounts">

  <div class="phase-banner-alpha">
  <p>
    <strong class="phase-tag">ALPHA</strong>
    <span>This is a new service – your <a href="javascript:void(0)">feedback</a> will help us to improve it.</span>
  </p>
</div>


<div class="text">

  <a id="back" class="link-back" href="javascript:history.back()">Back</a>



      <h1 class="heading-xlarge">File abridged accounts</h1>
      <form action="" method="POST" class="form">

          <p>Use this service to file prepared and approved abridged accounts.</p>


        <details>
          <summary><span class="summary">Not sure what type of accounts you have?</span></summary>
          <div class="panel panel-border-narrow">
            <p>Our example accounts may help you identify which type of accounts you've prepared.</p>
            <ul class="list list-bullet">
              <li><a href="javascript:void(0)">Word or similar: accounts for private limited companies (88KB)</a></li>
              <li><a href="javascript:void(0)">PDF: accounts for private limited companies (24KB)</a></li>
            </ul>
          </div>
        </details>



        <!--<div class="panel panel-border-wide">
      <h2 class="heading-medium">You can only file abridged accounts</h2>
        <p>This service doesn't yet support all of the changes to the Financial Reporting Standards introduced on 1 January 2016.</p>
        <p>We can't accept dormant, full or micro-entity company accounts starting on or after 1 January 2016. These will be available to file in the coming months. If you need to file those accounts now or need to file abbreviated accounts starting before 1 Jan 2016 please use <a href="/webfiling/webfiling-login-page">our WebFiling service</a>.</p>


          <details>
            <summary><span class="summary">Is your company eligible to file abridged accounts?</span></summary>
            <div class="panel panel-border-narrow">
              <p>To file abridged accounts, your accounts must meet <strong>at least two of the following:</strong></p>
              <ul class="list list-bullet">
                <li>Turnover must not be more than £10.2 million</li>
                <li>Balance sheet total must not be more than £5.1 million</li>
                <li>The average number of employees during the year must not be more than 50</li>
              </ul>
            </div>
          </details>
          <details>
            <summary><span class="summary">Not sure what type of accounts you have?</span></summary>
            <div class="panel panel-border-narrow">
              <p>Our example accounts may help you identify which type of accounts you've prepared.</p>
              <ul class="list list-bullet">
                <li><a href="javascript:void(0)">Word or similar: accounts for private limited companies (88KB)</a></li>
                <li><a href="javascript:void(0)">PDF: accounts for private limited companies (24KB)</a></li>
              </ul>
            </div>
          </details>


      </div>
      <!--
      <p class="heading-small form-group">This service provides for the minimum statutory filing only (a balance sheet and related notes).</p>
      <details>
        <summary><span class="summary">I want to file more than the minimum statutory filing</span></summary>
        <div class="panel panel-border-narrow">
          <p>Something about filing using the HMRC <a href="https://www.gov.uk/file-your-company-accounts-and-tax-return" target="_blank">File your accounts and Company Tax Return<span class="visuallyhidden"> Link opens in a new tab/window</span></a> service or Companies House <a href="https://www.gov.uk/government/organisations/companies-house/about/about-our-services#software-filing" target="_blank">software filing<span class="visuallyhidden"> Link opens in a new tab/window</span></a>.</p>
        </div>
      </details>
      <br>
      <p>You can't use this service if your accounts are being audited.</p>
      <details>
        <summary><span class="summary">My accounts are being audited</span></summary>
        <div class="panel panel-border-narrow">
          <p>Something about filing using the HMRC <a href="https://www.gov.uk/file-your-company-accounts-and-tax-return" target="_blank">File your accounts and Company Tax Return<span class="visuallyhidden"> Link opens in a new tab/window</span></a> service or Companies House <a href="https://www.gov.uk/government/organisations/companies-house/about/about-our-services#software-filing" target="_blank">software filing<span class="visuallyhidden"> Link opens in a new tab/window</span></a>.</p>
        </div>
      </details>-->


      <h2 class="heading-medium">Before you start</h2>
      <ul class="list list-bullet">
        <li>The abridged accounts need to be prepared, with figures rounded to whole numbers. Round down income, and round up spending.</li>
        <li>The abridged accounts should have been approved by the director/board of directors.</li>
      </ul>

	  <div class="form-group">
        <input type="submit" class="button button-start" value="Start" id="">
      </div>

            </form>

        </div><!-- text-->

      </main>

<footer class="group js-footer" id="footer" role="contentinfo">
        <nav>
          <div>
            <ul>
                   <li><a href="http://resources.companieshouse.gov.uk/legal/termsAndConditions.shtml" target="_blank">Policies</a></li>
                <li><a href="/help/cookies">Cookies</a></li>
                <li><a href="/help/contact-us">Contact us</a></li>
                 <li><a href="https://developer.companieshouse.gov.uk/" target="_blank">Developers</a></li>
            </ul>
         </div>
        </nav>
    </footer>


    <div id="global-app-error" class="app-error hidden"></div>

  <script src="/public/javascripts/govuk-template.js?0.17.3"></script>		  
  
  <!-- GOV.UK Prototype kit v3.0.0 -->
    		
  <!-- Javascript -->		
<script src="${cdnUrl}/script/javascripts/details.polyfill.js"></script>
<script src="${cdnUrl}/script/vendor/jquery-1.9.1.js"></script>		
<script src="${cdnUrl}/script/javascripts/govuk/selection-buttons.js"></script>		
<script src="${cdnUrl}/script/javascripts/application.js"></script>		
<script src="${cdnUrl}/script/javascripts/balance-sheet-calculations.js"></script>		
<script src="${cdnUrl}/script/javascripts/balance-sheet-notes-calculations.js"></script>		
<script src="${cdnUrl}/script/javascripts/accounts.js"></script>		
  <!-- GOV.UK Prototype kit v3.0.0 -->		



  </body>
</html>
